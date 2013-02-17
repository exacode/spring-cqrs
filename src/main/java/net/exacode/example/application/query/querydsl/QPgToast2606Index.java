package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2606Index is a Querydsl query type for QPgToast2606Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2606Index extends com.mysema.query.sql.RelationalPathBase<QPgToast2606Index> {

    private static final long serialVersionUID = -1112160900;

    public static final QPgToast2606Index pgToast2606Index = new QPgToast2606Index("pg_toast_2606_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast2606Index(String variable) {
        super(QPgToast2606Index.class, forVariable(variable), "pg_toast", "pg_toast_2606_index");
    }

    @SuppressWarnings("all")
    public QPgToast2606Index(Path<? extends QPgToast2606Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2606_index");
    }

    public QPgToast2606Index(PathMetadata<?> metadata) {
        super(QPgToast2606Index.class, metadata, "pg_toast", "pg_toast_2606_index");
    }

}

