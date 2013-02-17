package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2618Index is a Querydsl query type for QPgToast2618Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2618Index extends com.mysema.query.sql.RelationalPathBase<QPgToast2618Index> {

    private static final long serialVersionUID = -167398917;

    public static final QPgToast2618Index pgToast2618Index = new QPgToast2618Index("pg_toast_2618_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast2618Index(String variable) {
        super(QPgToast2618Index.class, forVariable(variable), "pg_toast", "pg_toast_2618_index");
    }

    @SuppressWarnings("all")
    public QPgToast2618Index(Path<? extends QPgToast2618Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2618_index");
    }

    public QPgToast2618Index(PathMetadata<?> metadata) {
        super(QPgToast2618Index.class, metadata, "pg_toast", "pg_toast_2618_index");
    }

}

