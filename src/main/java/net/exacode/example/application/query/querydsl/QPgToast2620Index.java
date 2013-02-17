package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2620Index is a Querydsl query type for QPgToast2620Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2620Index extends com.mysema.query.sql.RelationalPathBase<QPgToast2620Index> {

    private static final long serialVersionUID = 491071556;

    public static final QPgToast2620Index pgToast2620Index = new QPgToast2620Index("pg_toast_2620_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast2620Index(String variable) {
        super(QPgToast2620Index.class, forVariable(variable), "pg_toast", "pg_toast_2620_index");
    }

    @SuppressWarnings("all")
    public QPgToast2620Index(Path<? extends QPgToast2620Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2620_index");
    }

    public QPgToast2620Index(PathMetadata<?> metadata) {
        super(QPgToast2620Index.class, metadata, "pg_toast", "pg_toast_2620_index");
    }

}

