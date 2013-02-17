package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast2609 is a Querydsl query type for QPgToast2609
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast2609 extends com.mysema.query.sql.RelationalPathBase<QPgToast2609> {

    private static final long serialVersionUID = -8643335;

    public static final QPgToast2609 pgToast2609 = new QPgToast2609("pg_toast_2609");

    public final SimplePath<byte[]> chunkData = createSimple("chunk_data", byte[].class);

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QPgToast2609> pgToast2609Index = createPrimaryKey(chunkId, chunkSeq);

    public QPgToast2609(String variable) {
        super(QPgToast2609.class, forVariable(variable), "pg_toast", "pg_toast_2609");
    }

    @SuppressWarnings("all")
    public QPgToast2609(Path<? extends QPgToast2609> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_2609");
    }

    public QPgToast2609(PathMetadata<?> metadata) {
        super(QPgToast2609.class, metadata, "pg_toast", "pg_toast_2609");
    }

}

